package design_patterns.flyweight.compilers;

public class JavaCompiler implements Compiler {

    private final String jre;

    public JavaCompiler(String jre) {
        this.jre = jre;
    }

    @Override
    public String compile(String code) {
        System.out.println(code+"compiled using java jre"+jre);
        return "Java code is compiled successfully";
    }
}
