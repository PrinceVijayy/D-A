package design_patterns.flyweight;

import design_patterns.flyweight.compilers.Compiler;
import design_patterns.flyweight.factory.CompilerFactory;

public class FlyWeightMain {
    public static void main(String[] args) {
        for (int i = 0; i <4; i++) {
            Compiler java = CompilerFactory.getCompiler("java");
            java.compile("avc");
        }
        for (int i = 0; i <4; i++) {
            Compiler java = CompilerFactory.getCompiler("python");
            java.compile("asdfc");
        }
    }
}
