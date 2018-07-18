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
```
# Run complete. Total time: 00:13:35

Benchmark                           Mode  Cnt      Score     Error  Units
ThrowableProxyBenchmark.baseline   thrpt  200   9821.610 ± 210.106  ops/s
ThrowableProxyBenchmark.optimized  thrpt  200  37793.876 ± 586.063  ops/s
```
