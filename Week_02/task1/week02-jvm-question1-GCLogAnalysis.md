模拟环境：
Java：1.8.0_191
处理器：2.7 GHz 四核Intel Core i7
内存：16G
# Serial GC
java -Xmx1g -Xms1g -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseSerialGC GCLogAnalysis

1. 共生成对象次数:13164
2. 共生成对象次数:12830
3. 共生成对象次数:13085
4. 共生成对象次数:13029
5. 共生成对象次数:12757

# Parallel GC
java -Xmx1g -Xms1g -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseParallelGC GCLogAnalysis

1. 共生成对象次数:12526
2. 共生成对象次数:13511
3. 共生成对象次数:13508
4. 共生成对象次数:13403
5. 共生成对象次数:13350

# CMC GC
java -Xmx1g -Xms1g -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseConcMarkSweepGC GCLogAnalysis

1. 共生成对象次数:13690
2. 共生成对象次数:13668
3. 共生成对象次数:13871
4. 共生成对象次数:13811
5. 共生成对象次数:13765

# G1 GC
java -Xmx1g -Xms1g -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseG1GC GCLogAnalysis

1. 共生成对象次数:12814
2. 共生成对象次数:14310
3. 共生成对象次数:14304
4. 共生成对象次数:12903
5. 共生成对象次数:13931