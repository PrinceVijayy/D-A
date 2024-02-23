package design_patterns.flyweight.compilers;

public class PythonCompiler implements Compiler {
    private final String pre;

    public PythonCompiler(String pre) {
        this.pre = pre;
    }

    @Override
    public String compile(String code) {
        System.out.println(code+"compiled using java pre"+pre);
        return "Python code is compiled successfully";
    }
}
