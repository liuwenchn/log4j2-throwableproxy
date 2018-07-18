package org.log4j2;

import org.apache.logging.log4j.core.impl.ThrowableProxy;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

/**
 * @author zilong6
 */
public class ThrowableProxyBenchmark {

    @State(Scope.Benchmark)
    public static class ExceptionProvider {
        Exception ex;

        @Setup
        public void init() {
            // construct a stack whose sibling element are from different class
            I i = null;

            for (int j = 0; j <= 50; j++) {
                i = new B(new A(i));
            }

            try {
                i.trigger();
            } catch (Exception e) {
                ex = e;
            }
        }
    }

    @Benchmark
    public void baseline(ExceptionProvider provider) {
        new ThrowableProxy(provider.ex);
    }

    @Benchmark
    public void optimized(ExceptionProvider provider) {
        new OptimizedThrowableProxy(provider.ex);
    }

    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder()
                .include(ThrowableProxyBenchmark.class.getName())
                .warmupIterations(20)
                .measurementIterations(20)
                .build();

        new Runner(options).run();
    }

}

