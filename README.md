# environments
```
Architecture:          x86_64
CPU op-mode(s):        32-bit, 64-bit
Byte Order:            Little Endian
CPU(s):                32
On-line CPU(s) list:   0-31
Thread(s) per core:    2
Core(s) per socket:    8
Socket(s):             2
NUMA node(s):          2
Vendor ID:             GenuineIntel
CPU family:            6
Model:                 63
Model name:            Intel(R) Xeon(R) CPU E5-2630 v3 @ 2.40GHz
Stepping:              2
CPU MHz:               1200.000
CPU max MHz:           2400.0000
CPU min MHz:           1200.0000
BogoMIPS:              4794.19
Virtualization:        VT-x
L1d cache:             32K
L1i cache:             32K
L2 cache:              256K
L3 cache:              20480K
NUMA node0 CPU(s):     0-7,16-23
NUMA node1 CPU(s):     8-15,24-31

              total        used        free      shared  buff/cache   available
Mem:            31G        3.1G         22G        209M        5.3G         27G
Swap:          8.0G          0B        8.0G
```

# result

- 10
```
# Run complete. Total time: 00:20:22

Benchmark                                     Mode  Cnt      Score      Error  Units
ThrowableProxyBenchmark.baseline             thrpt  200  33032.534 ±  801.562  ops/s
ThrowableProxyBenchmark.optimized            thrpt  200  68240.450 ± 1415.441  ops/s
ThrowableProxyBenchmark.optimizedWithoutMap  thrpt  200  32693.300 ±  736.918  ops/s
```

- 250
```
Benchmark                                     Mode  Cnt      Score     Error  Units
ThrowableProxyBenchmark.baseline             thrpt  200   4244.618 ± 113.109  ops/s
ThrowableProxyBenchmark.optimized            thrpt  200  20505.901 ± 443.151  ops/s
ThrowableProxyBenchmark.optimizedWithoutMap  thrpt  200  14914.728 ± 313.668  ops/s
```

- 500
```
# Run complete. Total time: 00:20:23

Benchmark                                     Mode  Cnt      Score     Error  Units
ThrowableProxyBenchmark.baseline             thrpt  200   2062.741 ±  66.500  ops/s
ThrowableProxyBenchmark.optimized            thrpt  200  10918.578 ± 295.770  ops/s
ThrowableProxyBenchmark.optimizedWithoutMap  thrpt  200   9054.242 ± 264.561  ops/s
```
