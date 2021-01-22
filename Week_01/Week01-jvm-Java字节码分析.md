
```
Classfile /Users/wangbo/Develop/projects/java-course/java-course-01-jvm/src/main/java/javacourse/jvm/Hello.class
  Last modified 2021-1-22; size 1303 bytes
  MD5 checksum a964e3f22a63d1dfecc54b2b9ad18b62
  Compiled from "Hello.java"
public class javacourse.jvm.Hello
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #18.#49        // java/lang/Object."<init>":()V
   #2 = Class              #50            // java/lang/String
   #3 = String             #51            // apple
   #4 = String             #52            // banana
   #5 = Class              #53            // javacourse/jvm/Hello
   #6 = Class              #54            // javacourse/jvm/User
   #7 = String             #55            // ziyu
   #8 = Methodref          #6.#56         // javacourse/jvm/User."<init>":(Ljava/lang/String;I)V
   #9 = Fieldref           #57.#58        // java/lang/System.out:Ljava/io/PrintStream;
  #10 = Class              #59            // java/lang/StringBuilder
  #11 = Methodref          #10.#49        // java/lang/StringBuilder."<init>":()V
  #12 = Methodref          #6.#60         // javacourse/jvm/User.getName:()Ljava/lang/String;
  #13 = Methodref          #10.#61        // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #14 = String             #62            // 最爱的食物是：
  #15 = Methodref          #10.#63        // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #16 = Methodref          #64.#65        // java/io/PrintStream.println:(Ljava/lang/String;)V
  #17 = Methodref          #5.#66         // javacourse/jvm/Hello.printInfo:(I)V
  #18 = Class              #67            // java/lang/Object
  #19 = Utf8               a
  #20 = Utf8               I
  #21 = Utf8               ConstantValue
  #22 = Integer            18
  #23 = Utf8               <init>
  #24 = Utf8               ()V
  #25 = Utf8               Code
  #26 = Utf8               LineNumberTable
  #27 = Utf8               LocalVariableTable
  #28 = Utf8               this
  #29 = Utf8               Ljavacourse/jvm/Hello;
  #30 = Utf8               printInfo
  #31 = Utf8               (I)V
  #32 = Utf8               food
  #33 = Utf8               Ljava/lang/String;
  #34 = Utf8               user
  #35 = Utf8               Ljavacourse/jvm/User;
  #36 = Utf8               b
  #37 = Utf8               c
  #38 = Utf8               realAge
  #39 = Utf8               loveFood
  #40 = Utf8               [Ljava/lang/String;
  #41 = Utf8               StackMapTable
  #42 = Class              #40            // "[Ljava/lang/String;"
  #43 = Class              #54            // javacourse/jvm/User
  #44 = Utf8               main
  #45 = Utf8               ([Ljava/lang/String;)V
  #46 = Utf8               args
  #47 = Utf8               SourceFile
  #48 = Utf8               Hello.java
  #49 = NameAndType        #23:#24        // "<init>":()V
  #50 = Utf8               java/lang/String
  #51 = Utf8               apple
  #52 = Utf8               banana
  #53 = Utf8               javacourse/jvm/Hello
  #54 = Utf8               javacourse/jvm/User
  #55 = Utf8               ziyu
  #56 = NameAndType        #23:#68        // "<init>":(Ljava/lang/String;I)V
  #57 = Class              #69            // java/lang/System
  #58 = NameAndType        #70:#71        // out:Ljava/io/PrintStream;
  #59 = Utf8               java/lang/StringBuilder
  #60 = NameAndType        #72:#73        // getName:()Ljava/lang/String;
  #61 = NameAndType        #74:#75        // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #62 = Utf8               最爱的食物是：
  #63 = NameAndType        #76:#73        // toString:()Ljava/lang/String;
  #64 = Class              #77            // java/io/PrintStream
  #65 = NameAndType        #78:#79        // println:(Ljava/lang/String;)V
  #66 = NameAndType        #30:#31        // printInfo:(I)V
  #67 = Utf8               java/lang/Object
  #68 = Utf8               (Ljava/lang/String;I)V
  #69 = Utf8               java/lang/System
  #70 = Utf8               out
  #71 = Utf8               Ljava/io/PrintStream;
  #72 = Utf8               getName
  #73 = Utf8               ()Ljava/lang/String;
  #74 = Utf8               append
  #75 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #76 = Utf8               toString
  #77 = Utf8               java/io/PrintStream
  #78 = Utf8               println
  #79 = Utf8               (Ljava/lang/String;)V
{
  public javacourse.jvm.Hello();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 9: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Ljavacourse/jvm/Hello;

  public static void printInfo(int);
    descriptor: (I)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=9, args_size=1
         0: iconst_1
         1: istore_1
         2: iload_0
         3: iload_1
         4: iadd
         5: istore_2
         6: iconst_2
         7: anewarray     #2                  // class java/lang/String
        10: dup
        11: iconst_0
        12: ldc           #3                  // String apple
        14: aastore
        15: dup
        16: iconst_1
        17: ldc           #4                  // String banana
        19: aastore
        20: astore_3
        21: bipush        18
        23: iload_2
        24: if_icmple     104
        27: new           #6                  // class javacourse/jvm/User
        30: dup
        31: ldc           #7                  // String ziyu
        33: iload_2
        34: invokespecial #8                  // Method javacourse/jvm/User."<init>":(Ljava/lang/String;I)V
        37: astore        4
        39: aload_3
        40: astore        5
        42: aload         5
        44: arraylength
        45: istore        6
        47: iconst_0
        48: istore        7
        50: iload         7
        52: iload         6
        54: if_icmpge     104
        57: aload         5
        59: iload         7
        61: aaload
        62: astore        8
        64: getstatic     #9                  // Field java/lang/System.out:Ljava/io/PrintStream;
        67: new           #10                 // class java/lang/StringBuilder
        70: dup
        71: invokespecial #11                 // Method java/lang/StringBuilder."<init>":()V
        74: aload         4
        76: invokevirtual #12                 // Method javacourse/jvm/User.getName:()Ljava/lang/String;
        79: invokevirtual #13                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        82: ldc           #14                 // String 最爱的食物是：
        84: invokevirtual #13                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        87: aload         8
        89: invokevirtual #13                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        92: invokevirtual #15                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
        95: invokevirtual #16                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        98: iinc          7, 1
       101: goto          50
       104: return
      LineNumberTable:
        line 13: 0
        line 14: 2
        line 15: 6
        line 16: 21
        line 17: 27
        line 18: 39
        line 19: 64
        line 18: 98
        line 22: 104
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           64      34     8  food   Ljava/lang/String;
           39      65     4  user   Ljavacourse/jvm/User;
            0     105     0     b   I
            2     103     1     c   I
            6      99     2 realAge   I
           21      84     3 loveFood   [Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 50
          locals = [ int, int, int, class "[Ljava/lang/String;", class javacourse/jvm/User, class "[Ljava/lang/String;", int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 53
          locals = [ int, int, int, class "[Ljava/lang/String;" ]
          stack = []

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_2
         1: invokestatic  #17                 // Method printInfo:(I)V
         4: return
      LineNumberTable:
        line 25: 0
        line 26: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  args   [Ljava/lang/String;
}
SourceFile: "Hello.java"
```
