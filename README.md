# environments
```
Architecture:          x86_64
CPU op-mode(s):        32-bit, 64-bit
Byte Order:            Little Endian
CPU(s):                12
On-line CPU(s) list:   0-11
Thread(s) per core:    1
Core(s) per socket:    6
Socket(s):             2
NUMA node(s):          2
Vendor ID:             GenuineIntel
CPU family:            6
Model:                 62
Model name:            Intel(R) Xeon(R) CPU E5-2620 v2 @ 2.10GHz
Stepping:              4
CPU MHz:               2100.000
BogoMIPS:              4205.11
Virtualization:        VT-x
L1d cache:             32K
L1i cache:             32K
L2 cache:              256K
L3 cache:              15360K
NUMA node0 CPU(s):     0-5
NUMA node1 CPU(s):     6-11


              total        used        free      shared  buff/cache   available
Mem:            15G        894M        1.1G        580M         13G         13G
Swap:          8.0G        235M        7.8G
```

# result
```
# Run complete. Total time: 00:13:35

Benchmark                           Mode  Cnt      Score     Error  Units
ThrowableProxyBenchmark.baseline   thrpt  200   9821.610 ± 210.106  ops/s
ThrowableProxyBenchmark.optimized  thrpt  200  37793.876 ± 586.063  ops/s
```
