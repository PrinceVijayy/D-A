package design_patterns.flyweight.factory;

import design_patterns.flyweight.compilers.Compiler;
import design_patterns.flyweight.compilers.JavaCompiler;
import design_patterns.flyweight.compilers.PythonCompiler;

import java.util.HashMap;
import java.util.Map;

public class CompilerFactory {
    static Map<String, Compiler> map = new HashMap<>();

    public static synchronized Compiler getCompiler(String compilerName) {
        if (!map.isEmpty() && (map.containsKey(compilerName))) {
            return map.get(compilerName);
        }
        switch (compilerName) {
            case "java" -> {
                JavaCompiler jre = new JavaCompiler("jre");
                map.put("java", jre);
                return jre;
            }
            case "python" -> {
                PythonCompiler pre = new PythonCompiler("pre");
                map.put("python", pre);
                return pre;
            }
        }
        throw new RuntimeException();
    }
}
