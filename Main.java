// You can delete the imports that aren't needed, but you don't have to
// since the compiler automatically deletes unused imports.

// Also don't worry about comments because the compiler automatically removes
// them before running the program :)

import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.awt.*;
import java.lang.*;
import java.math.*;
import javax.swing.*;
import java.time.*;
import java.time.format.*;

// This code was based on the GeeksForGeeks template
// (https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/)
// as well as the USACO Fast IO Template (https://usaco.guide/general/fast-io?lang=java
// and https://usaco.guide/general/input-output?lang=java)
// Lastly, a lot of the code was based on the template from William Fiset
// (https://github.com/williamfiset/FastJavaIO and more specifically
// https://github.com/williamfiset/FastJavaIO/blob/master/com/williamfiset/fastjavaio/InputReader.java)



public class Main {
    private static class FastInput { final private int BUFFER_SIZE = 1 << 16; private DataInputStream stream = new DataInputStream(System.in); private byte[] buffer = new byte[BUFFER_SIZE]; private int bufferPointer = 0, bytesRead = 0; public FastInput() { } /* //The below code is from the USACO fast IO template // standard input public Reader() { this(new DataInputStream(System.in), System.out); } public Reader(InputStream i, OutputStream o) { super(o); stream = i; //buffer = new byte[BUFFER_SIZE]; //bufferPointer = bytesRead = 0; } // file input public Reader(String i, String o) throws IOException { super(new FileWriter(o)); stream = new DataInputStream(new FileInputStream(i)); } */ /* // from the USACO fast IO template // to read in entire lines, replace c <= ' ' // with a function that checks whether c is a line break public String next() throws IOException { int c; do { c = read(); } while (c <= ' '); StringBuilder res = new StringBuilder(); do { res.appendCodePoint(c); c = read(); } while (c > ' '); return res.toString(); } The next code for next() is the one from the GeeksForGeeks template. */ public String next() throws IOException { byte[] buf = new byte[100000]; int cnt = 0, c; while ((c = read()) != -1) { if (c <= ' ') if (cnt != 0) break; buf[cnt++] = (byte)c; } return new String(buf, 0, cnt); } /* // from the USACO fast IO template public String nextLine() throws IOException { int c; do { c = read(); } while (c <= '\n'); StringBuilder res = new StringBuilder(); do { res.appendCodePoint(c); c = read(); } while (c > '\n'); return res.toString(); } The next code for nextLine() is the one from the GeeksForGeeks template. */ public String nextLine() throws IOException { byte[] buf = new byte[100000]; int cnt = 0, c; while ((c = read()) != -1) { if (c == '\n') if (cnt != 0) break; buf[cnt++] = (byte)c; } return new String(buf, 0, cnt); } public int nextInt() throws IOException { int ret = 0; byte c = read(); while (c <= ' ') c = read(); boolean neg = (c == '-'); if (neg) c = read(); do ret = ret * 10 + c - '0'; while ((c = read()) >= '0' && c <= '9'); if (neg) return -ret; return ret; } public long nextLong() throws IOException { long ret = 0; byte c = read(); while (c <= ' ') c = read(); boolean neg = (c == '-'); if (neg) c = read(); do ret = ret * 10 + c - '0'; while ((c = read()) >= '0' && c <= '9'); if (neg) return -ret; return ret; } public float nextFloat() throws IOException { float ret = 0, div = 1; byte c = read(); while (c <= ' ') c = read(); boolean neg = (c == '-'); if (neg) c = read(); do ret = ret * 10 + c - '0'; while ((c = read()) >= '0' && c <= '9'); if (c == '.') while ((c = read()) >= '0' && c <= '9') ret += (c - '0') / (div *= 10); if (neg) return -ret; return ret; } public double nextDouble() throws IOException { double ret = 0, div = 1; byte c = read(); while (c <= ' ') c = read(); boolean neg = (c == '-'); if (neg) c = read(); do ret = ret * 10 + c - '0'; while ((c = read()) >= '0' && c <= '9'); if (c == '.') while ((c = read()) >= '0' && c <= '9') ret += (c - '0') / (div *= 10); if (neg) return -ret; return ret; } public byte nextByte() throws IOException { return (byte) nextInt(); } public short nextShort() throws IOException { return (short) nextInt(); } public float nextFloatExact() throws IOException { return Float.parseFloat(next()); } public double nextDoubleExact() throws IOException { return Double.parseDouble(next()); } private void fillBuffer() throws IOException { bytesRead = stream.read(buffer, bufferPointer = 0, BUFFER_SIZE); if (bytesRead == -1) buffer[0] = -1; } private byte read() throws IOException { if (bufferPointer == bytesRead) fillBuffer(); return buffer[bufferPointer++]; } public void close() throws IOException { stream.close(); } public byte[] nextByteArray(int n) throws IOException { byte[] ar = new byte[n]; for (int i = 0; i < n; i++) ar[i] = nextByte(); return ar; } public short[] nextShortArray(int n) throws IOException { short[] ar = new short[n]; for (int i = 0; i < n; i++) ar[i] = nextShort(); return ar; } public int[] nextIntArray(int n) throws IOException { int[] ar = new int[n]; for (int i = 0; i < n; i++) ar[i] = nextInt(); return ar; } public long[] nextLongArray(int n) throws IOException { long[] ar = new long[n]; for (int i = 0; i < n; i++) ar[i] = nextLong(); return ar; } public float[] nextFloatArray(int n) throws IOException { float[] ar = new float[n]; for (int i = 0; i < n; i++) ar[i] = nextFloat(); return ar; } public double[] nextDoubleArray(int n) throws IOException { double[] ar = new double[n]; for (int i = 0; i < n; i++) ar[i] = nextDouble(); return ar; } public float[] nextFloatArrayExact(int n) throws IOException { float[] ar = new float[n]; for (int i = 0; i < n; i++) ar[i] = nextFloatExact(); return ar; } public double[] nextDoubleArrayExact(int n) throws IOException { double[] ar = new double[n]; for (int i = 0; i < n; i++) ar[i] = nextDoubleExact(); return ar; } public String[] nextStringArray(int n) throws IOException { String[] ar = new String[n]; for (int i = 0; i < n; i++) { String str = next(); if (str == null) throw new IOException(); ar[i] = str; } return ar; } public byte[] nextByteArray1(int n) throws IOException { byte[] ar = new byte[n+1]; for (int i = 1; i <= n; i++) ar[i] = nextByte(); return ar; } public short[] nextShortArray1(int n) throws IOException { short[] ar = new short[n+1]; for (int i = 1; i <= n; i++) ar[i] = nextShort(); return ar; } public int[] nextIntArray1(int n) throws IOException { int[] ar = new int[n+1]; for (int i = 1; i <= n; i++) ar[i] = nextInt(); return ar; } public long[] nextLongArray1(int n) throws IOException { long[] ar = new long[n+1]; for (int i = 1; i <= n; i++) ar[i] = nextLong(); return ar; } public float[] nextFloatArray1(int n) throws IOException { float[] ar = new float[n+1]; for (int i = 1; i <= n; i++) ar[i] = nextFloat(); return ar; } public double[] nextDoubleArray1(int n) throws IOException { double[] ar = new double[n+1]; for (int i = 1; i <= n; i++) ar[i] = nextDouble(); return ar; } public float[] nextFloatArrayExact1(int n) throws IOException { float[] ar = new float[n+1]; for (int i = 1; i <= n; i++) ar[i] = nextFloatExact(); return ar; } public double[] nextDoubleArrayExact1(int n) throws IOException { double[] ar = new double[n+1]; for (int i = 1; i <= n; i++) ar[i] = nextDoubleExact(); return ar; } public String[] nextStringArray1(int n) throws IOException { String[] ar = new String[n+1]; for (int i = 1; i <= n; i++) ar[i] = next(); return ar; } public byte[][] nextByteMatrix(int rows, int cols) throws IOException { byte[][] matrix = new byte[rows][cols]; for(int i = 0; i < rows; i++) for (int j = 0; j < cols; j++) matrix[i][j] = nextByte(); return matrix; } public short[][] nextShortMatrix(int rows, int cols) throws IOException { short[][] matrix = new short[rows][cols]; for(int i = 0; i < rows; i++) for (int j = 0; j < cols; j++) matrix[i][j] = nextShort(); return matrix; } public int[][] nextIntMatrix(int rows, int cols) throws IOException { int[][] matrix = new int[rows][cols]; for(int i = 0; i < rows; i++) for (int j = 0; j < cols; j++) matrix[i][j] = nextInt(); return matrix; } public long[][] nextLongMatrix(int rows, int cols) throws IOException { long[][] matrix = new long[rows][cols]; for(int i = 0; i < rows; i++) for (int j = 0; j < cols; j++) matrix[i][j] = nextLong(); return matrix; } public float[][] nextFloatMatrix(int rows, int cols) throws IOException { float[][] matrix = new float[rows][cols]; for(int i = 0; i < rows; i++) for (int j = 0; j < cols; j++) matrix[i][j] = nextFloat(); return matrix; } public double[][] nextDoubleMatrix(int rows, int cols) throws IOException { double[][] matrix = new double[rows][cols]; for(int i = 0; i < rows; i++) for (int j = 0; j < cols; j++) matrix[i][j] = nextDouble(); return matrix; } public float[][] nextFloatMatrixExact(int rows, int cols) throws IOException { float[][] matrix = new float[rows][cols]; for(int i = 0; i < rows; i++) for (int j = 0; j < cols; j++) matrix[i][j] = nextFloatExact(); return matrix; } public double[][] nextDoubleMatrixExact(int rows, int cols) throws IOException { double[][] matrix = new double[rows][cols]; for(int i = 0; i < rows; i++) for (int j = 0; j < cols; j++) matrix[i][j] = nextDoubleExact(); return matrix; } public String[][] nextStringMatrix(int rows, int cols) throws IOException { String[][] matrix = new String[rows][cols]; for(int i = 0; i < rows; i++) for (int j = 0; j < cols; j++) matrix[i][j] = next(); return matrix; } public byte[][] nextByteMatrix1(int rows, int cols) throws IOException { byte[][] matrix = new byte[rows+1][cols+1]; for(int i = 1; i <= rows; i++) for (int j = 1; j <= cols; j++) matrix[i][j] = nextByte(); return matrix; } public short[][] nextShortMatrix1(int rows, int cols) throws IOException { short[][] matrix = new short[rows+1][cols+1]; for(int i = 1; i <= rows; i++) for (int j = 1; j <= cols; j++) matrix[i][j] = nextShort(); return matrix; } public int[][] nextIntMatrix1(int rows, int cols) throws IOException { int[][] matrix = new int[rows+1][cols+1]; for(int i = 1; i <= rows; i++) for (int j = 1; j <= cols; j++) matrix[i][j] = nextInt(); return matrix; } public long[][] nextLongMatrix1(int rows, int cols) throws IOException { long[][] matrix = new long[rows+1][cols+1]; for(int i = 1; i <= rows; i++) for (int j = 1; j <= cols; j++) matrix[i][j] = nextLong(); return matrix; } public float[][] nextFloatMatrix1(int rows, int cols) throws IOException { float[][] matrix = new float[rows+1][cols+1]; for(int i = 1; i <= rows; i++) for (int j = 1; j <= cols; j++) matrix[i][j] = nextFloat(); return matrix; } public double[][] nextDoubleMatrix1(int rows, int cols) throws IOException { double[][] matrix = new double[rows+1][cols+1]; for(int i = 1; i <= rows; i++) for (int j = 1; j <= cols; j++) matrix[i][j] = nextDouble(); return matrix; } public float[][] nextFloatMatrixExact1(int rows, int cols) throws IOException { float[][] matrix = new float[rows+1][cols+1]; for(int i = 1; i <= rows; i++) for (int j = 1; j <= cols; j++) matrix[i][j] = nextFloatExact(); return matrix; } public double[][] nextDoubleMatrixExact1(int rows, int cols) throws IOException { double[][] matrix = new double[rows+1][cols+1]; for(int i = 1; i <= rows; i++) for (int j = 1; j <= cols; j++) matrix[i][j] = nextDoubleExact(); return matrix; } public String[][] nextStringMatrix1(int rows, int cols) throws IOException { String[][] matrix = new String[rows+1][cols+1]; for(int i = 1; i <= rows; i++) for (int j = 1; j <= cols; j++) matrix[i][j] = next(); return matrix; } public String allLines() throws IOException { ByteArrayOutputStream result = new ByteArrayOutputStream(); byte[] buffer = new byte[1024]; for (int length; (length = stream.read(buffer)) != -1; ) result.write(buffer, 0, length); return result.toString("UTF-8"); } }
    public static void main (String [] args) throws IOException {
        FastInput io = new FastInput();
        DataOutputStream dos = new DataOutputStream(System.out);
        StringBuilder sb = new StringBuilder();
        
	    int a = io.nextInt(), b = io.nextInt(), c = io.nextInt();
	    sb.append("The sum of these three numbers is: ").append(a+b+c).append("\n");

        dos.write((sb.toString()).getBytes());
        
        //io.close(); // You don't have to close the DataInputStream (you probably
		              // should, but not doing so allows you to make your code even faster)
        dos.flush();
        dos.close();
    }
}
/*

Here is the code for the fast IO evenly spaced out for visual purposes and for ease of updating:
(Note that the reason why it is on one line is so it is easier to copy and paste)
(It is also important to note that if you wanted to save space, you could use the "nextLong()"
method, rename it to something like "nextInteger()", and then use it to read in any integer
value, casting to the desired data type. For example, if you wanted an integer, you could say
"int n = (int) io.nextInteger();". The same could be said for decimals, how you could rename
the method "nextLong()" to "nextDecimal()" and then casting to the desired decimal, such as a
float. You could even use the "nextDecimal()" method for ALL NUMERIC TYPES, just casting to the
desired data type. For example, you could read in a long by doing "long n = (long) nextDecimal();".
You could also combine the next() and nextLine() methods into one by using the next() method but
adding a parameter called "char delim" that specifies the delimiter that you want to split by
as well as replacing the line "if (c == ' ') if (cnt != 0) break;" with 
"if (c == delim) if (cnt != 0) break;" and then in the implementation passing through either ' '
to split by spaces (like next()) or '\n' to split by lines (like nextLine()). Lastly, if you
wanted to save space, you can delete all of the unnecessary methods, such as the ones that read
in 1D and 2D arrays as those can be easily implemented. Therefore, the only methods you would
be left with are nextDouble() as it will become the nextDecimal() method, next() as it will
be used for next() and nextLine(), allLines(), fillBuffer(), read(), and close(). If you scroll
to the bottom of this page, you will see the short version of this code.)


private static class FastInput {
    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream stream = new DataInputStream(System.in);
    private byte[] buffer = new byte[BUFFER_SIZE];
    private int bufferPointer = 0, bytesRead = 0;
    public FastInput() {
    }
    
    /*
    //The below code is from the USACO fast IO template
    // standard input
    public Reader() { this(new DataInputStream(System.in), System.out); }
    public Reader(InputStream i, OutputStream o) {
        super(o);
        stream = i;
        //buffer = new byte[BUFFER_SIZE];
        //bufferPointer = bytesRead = 0;
    }

    // file input
    public Reader(String i, String o) throws IOException {
        super(new FileWriter(o));
        stream = new DataInputStream(new FileInputStream(i));
    }
    */
    
    /*
    // from the USACO fast IO template
    // to read in entire lines, replace c <= ' '
    // with a function that checks whether c is a line break
    public String next() throws IOException {
        int c;
        do {
            c = read();
        } while (c <= ' ');
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (c > ' ');
        return res.toString();
    }
    
    The next code for next() is the one from the GeeksForGeeks template.
    */
    /*
    public String next() throws IOException {
        byte[] buf = new byte[100000];
        int cnt = 0, c;
        while ((c = read()) != -1) {
            if (c == ' ') if (cnt != 0) break;
            buf[cnt++] = (byte)c;
        }
        return new String(buf, 0, cnt);
    }
    */
    /*
    // from the USACO fast IO template
    public String nextLine() throws IOException {
        int c;
        do {
            c = read();
        } while (c <= '\n');
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (c > '\n');
        return res.toString();
    }
    The next code for nextLine() is the one from the GeeksForGeeks template.
    */
    /*
    public String nextLine() throws IOException {
        byte[] buf = new byte[100000];
        int cnt = 0, c;
        while ((c = read()) != -1) {
            if (c == '\n') if (cnt != 0) break;
            buf[cnt++] = (byte)c;
        }
        return new String(buf, 0, cnt);
    }
    public int nextInt() throws IOException {
        int ret = 0;
        byte c = read();
        while (c <= ' ') c = read();
        boolean neg = (c == '-');
        if (neg) c = read();
        do ret = ret * 10 + c - '0'; while ((c = read()) >= '0' && c <= '9');
        if (neg) return -ret;
        return ret;
    }
    public long nextLong() throws IOException {
        long ret = 0;
        byte c = read();
        while (c <= ' ') c = read();
        boolean neg = (c == '-');
        if (neg) c = read();
        do ret = ret * 10 + c - '0'; while ((c = read()) >= '0' && c <= '9');
        if (neg) return -ret;
        return ret;
    }
    public float nextFloat() throws IOException {
        float ret = 0, div = 1;
        byte c = read();
        while (c <= ' ') c = read();
        boolean neg = (c == '-');
        if (neg) c = read();
        do ret = ret * 10 + c - '0'; while ((c = read()) >= '0' && c <= '9');
        if (c == '.') while ((c = read()) >= '0' && c <= '9') ret += (c - '0') / (div *= 10);
        if (neg) return -ret;
        return ret;
    }
    public double nextDouble() throws IOException {
        double ret = 0, div = 1;
        byte c = read();
        while (c <= ' ') c = read();
        boolean neg = (c == '-');
        if (neg) c = read();
        do ret = ret * 10 + c - '0'; while ((c = read()) >= '0' && c <= '9');
        if (c == '.') while ((c = read()) >= '0' && c <= '9') ret += (c - '0') / (div *= 10);
        if (neg) return -ret;
        return ret;
    }
    public byte nextByte() throws IOException { return (byte) nextInt(); }
    public short nextShort() throws IOException { return (short) nextInt(); }
    public float nextFloatExact() throws IOException { return Float.parseFloat(next()); }
    public double nextDoubleExact() throws IOException { return Double.parseDouble(next()); }
    private void fillBuffer() throws IOException {
        bytesRead = stream.read(buffer, bufferPointer = 0, BUFFER_SIZE);
        if (bytesRead == -1) buffer[0] = -1;
    }
    private byte read() throws IOException {
        if (bufferPointer == bytesRead) fillBuffer();
        return buffer[bufferPointer++];
    }
    public void close() throws IOException {
        stream.close();
    }
    public byte[] nextByteArray(int n) throws IOException {
        byte[] ar = new byte[n];
        for (int i = 0; i < n; i++) ar[i] = nextByte();
        return ar;
    }
    public short[] nextShortArray(int n) throws IOException {
        short[] ar = new short[n];
        for (int i = 0; i < n; i++) ar[i] = nextShort();
        return ar;
    }
    public int[] nextIntArray(int n) throws IOException {
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) ar[i] = nextInt();
        return ar;
    }
    public long[] nextLongArray(int n) throws IOException {
        long[] ar = new long[n];
        for (int i = 0; i < n; i++) ar[i] = nextLong();
        return ar;
    }
    public float[] nextFloatArray(int n) throws IOException {
        float[] ar = new float[n];
        for (int i = 0; i < n; i++) ar[i] = nextFloat();
        return ar;
    }
    public double[] nextDoubleArray(int n) throws IOException {
        double[] ar = new double[n];
        for (int i = 0; i < n; i++) ar[i] = nextDouble();
        return ar;
    }
    public float[] nextFloatArrayExact(int n) throws IOException {
        float[] ar = new float[n];
        for (int i = 0; i < n; i++) ar[i] = nextFloatExact();
        return ar;
    }
    public double[] nextDoubleArrayExact(int n) throws IOException {
        double[] ar = new double[n];
        for (int i = 0; i < n; i++) ar[i] = nextDoubleExact();
        return ar;
    }
    public String[] nextStringArray(int n) throws IOException {
        String[] ar = new String[n];
        for (int i = 0; i < n; i++) {
            String str = next();
            if (str == null) throw new IOException();
            ar[i] = str;
        }
        return ar;
    }
    public byte[] nextByteArray1(int n) throws IOException {
        byte[] ar = new byte[n+1];
        for (int i = 1; i <= n; i++) ar[i] = nextByte();
        return ar;
    }
    public short[] nextShortArray1(int n) throws IOException {
        short[] ar = new short[n+1];
        for (int i = 1; i <= n; i++) ar[i] = nextShort();
        return ar;
    }
    public int[] nextIntArray1(int n) throws IOException {
        int[] ar = new int[n+1];
        for (int i = 1; i <= n; i++) ar[i] = nextInt();
        return ar;
    }
    public long[] nextLongArray1(int n) throws IOException {
        long[] ar = new long[n+1];
        for (int i = 1; i <= n; i++) ar[i] = nextLong();
        return ar;
    }
    public float[] nextFloatArray1(int n) throws IOException {
        float[] ar = new float[n+1];
        for (int i = 1; i <= n; i++) ar[i] = nextFloat();
        return ar;
    }
    public double[] nextDoubleArray1(int n) throws IOException {
        double[] ar = new double[n+1];
        for (int i = 1; i <= n; i++) ar[i] = nextDouble();
        return ar;
    }
    public float[] nextFloatArrayExact1(int n) throws IOException {
        float[] ar = new float[n+1];
        for (int i = 1; i <= n; i++) ar[i] = nextFloatExact();
        return ar;
    }
    public double[] nextDoubleArrayExact1(int n) throws IOException {
        double[] ar = new double[n+1];
        for (int i = 1; i <= n; i++) ar[i] = nextDoubleExact();
        return ar;
    }
    public String[] nextStringArray1(int n) throws IOException {
        String[] ar = new String[n+1];
        for (int i = 1; i <= n; i++) ar[i] = next();
        return ar;
    }
    public byte[][] nextByteMatrix(int rows, int cols) throws IOException {
        byte[][] matrix = new byte[rows][cols];
        for(int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = nextByte();
        return matrix;
    }
    public short[][] nextShortMatrix(int rows, int cols) throws IOException {
        short[][] matrix = new short[rows][cols];
        for(int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = nextShort();
        return matrix;
    }
    public int[][] nextIntMatrix(int rows, int cols) throws IOException {
        int[][] matrix = new int[rows][cols];
        for(int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = nextInt();
        return matrix;
    }
    public long[][] nextLongMatrix(int rows, int cols) throws IOException {
        long[][] matrix = new long[rows][cols];
        for(int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = nextLong();
        return matrix;
    }
    public float[][] nextFloatMatrix(int rows, int cols) throws IOException {
        float[][] matrix = new float[rows][cols];
        for(int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = nextFloat();
        return matrix;
    }
    public double[][] nextDoubleMatrix(int rows, int cols) throws IOException {
        double[][] matrix = new double[rows][cols];
        for(int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = nextDouble();
        return matrix;
    }
    public float[][] nextFloatMatrixExact(int rows, int cols) throws IOException {
        float[][] matrix = new float[rows][cols];
        for(int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = nextFloatExact();
        return matrix;
    }
    public double[][] nextDoubleMatrixExact(int rows, int cols) throws IOException {
        double[][] matrix = new double[rows][cols];
        for(int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = nextDoubleExact();
        return matrix;
    }
    public String[][] nextStringMatrix(int rows, int cols) throws IOException {
        String[][] matrix = new String[rows][cols];
        for(int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = next();
        return matrix;
    }
    public byte[][] nextByteMatrix1(int rows, int cols) throws IOException {
        byte[][] matrix = new byte[rows+1][cols+1];
        for(int i = 1; i <= rows; i++)
            for (int j = 1; j <= cols; j++)
                matrix[i][j] = nextByte();
        return matrix;
    }
    public short[][] nextShortMatrix1(int rows, int cols) throws IOException {
        short[][] matrix = new short[rows+1][cols+1];
        for(int i = 1; i <= rows; i++)
            for (int j = 1; j <= cols; j++)
                matrix[i][j] = nextShort();
        return matrix;
    }
    public int[][] nextIntMatrix1(int rows, int cols) throws IOException {
        int[][] matrix = new int[rows+1][cols+1];
        for(int i = 1; i <= rows; i++)
            for (int j = 1; j <= cols; j++)
                matrix[i][j] = nextInt();
        return matrix;
    }
    public long[][] nextLongMatrix1(int rows, int cols) throws IOException {
        long[][] matrix = new long[rows+1][cols+1];
        for(int i = 1; i <= rows; i++)
            for (int j = 1; j <= cols; j++)
                matrix[i][j] = nextLong();
        return matrix;
    }
    public float[][] nextFloatMatrix1(int rows, int cols) throws IOException {
        float[][] matrix = new float[rows+1][cols+1];
        for(int i = 1; i <= rows; i++)
            for (int j = 1; j <= cols; j++)
                matrix[i][j] = nextFloat();
        return matrix;
    }
    public double[][] nextDoubleMatrix1(int rows, int cols) throws IOException {
        double[][] matrix = new double[rows+1][cols+1];
        for(int i = 1; i <= rows; i++)
            for (int j = 1; j <= cols; j++)
                matrix[i][j] = nextDouble();
        return matrix;
    }
    public float[][] nextFloatMatrixExact1(int rows, int cols) throws IOException {
        float[][] matrix = new float[rows+1][cols+1];
        for(int i = 1; i <= rows; i++)
            for (int j = 1; j <= cols; j++)
                matrix[i][j] = nextFloatExact();
        return matrix;
    }
    public double[][] nextDoubleMatrixExact1(int rows, int cols) throws IOException {
        double[][] matrix = new double[rows+1][cols+1];
        for(int i = 1; i <= rows; i++)
            for (int j = 1; j <= cols; j++)
                matrix[i][j] = nextDoubleExact();
        return matrix;
    }
    public String[][] nextStringMatrix1(int rows, int cols) throws IOException {
        String[][] matrix = new String[rows+1][cols+1];
        for(int i = 1; i <= rows; i++)
            for (int j = 1; j <= cols; j++)
                matrix[i][j] = next();
        return matrix;    
    }
    public String allLines() throws IOException {
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        for (int length; (length = stream.read(buffer)) != -1; ) result.write(buffer, 0, length);
        return result.toString("UTF-8");
    }
}
*/

/*
Here is the code that was used to take the code and convert it into a one-liner (so you
can reuse it if youo want to make changes):

import java.io.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		String lines = br.lines().collect(Collectors.joining());
		lines.replaceAll("\n", "");
		System.out.println(lines.trim().replaceAll(" +", " "));
	}
}

One important thing to remember is that you don't have to worry about using
this code as a way to take your code and put it all one one line (e.g. :
import java.io.*;import java.util.stream.*;public class Main {	public static void main(String[] args) {		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));		String lines = br.lines().collect(Collectors.joining());		lines.replaceAll("\n", "");		System.out.println(lines.trim().replaceAll(" +", " "));	}}

because that doesn't actually make your code run faster, and it only makes
your code not only unreadable, but also very tough do debug, say on a wrong
answer. Therefore, don't do this. The only reason why the FastIO class is on
one line is so that it can be copied and pasted easily
*/
/*
Small but fast code:

private static class FastInput {
    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream stream = new DataInputStream(System.in);
    private byte[] buffer = new byte[BUFFER_SIZE];
    private int bufferPointer = 0, bytesRead = 0;
    public FastInput() {
    }
    public String next(char delim) throws IOException {
        byte[] buf = new byte[100000];
        int cnt = 0, c;
        while ((c = read()) != -1) {
            if (c == delim) if (cnt != 0) break;
            buf[cnt++] = (byte)c;
        }
        return new String(buf, 0, cnt);
    }
    public String nextLine() throws IOException {
        byte[] buf = new byte[100000];
        int cnt = 0, c;
        while ((c = read()) != -1) {
            if (c == '\n') if (cnt != 0) break;
            buf[cnt++] = (byte)c;
        }
        return new String(buf, 0, cnt);
    }
    public double nextDecimal() throws IOException {
        double ret = 0, div = 1;
        byte c = read();
        while (c <= ' ') c = read();
        boolean neg = (c == '-');
        if (neg) c = read();
        do ret = ret * 10 + c - '0'; while ((c = read()) >= '0' && c <= '9');
        if (c == '.') while ((c = read()) >= '0' && c <= '9') ret += (c - '0') / (div *= 10);
        if (neg) return -ret;
        return ret;
    }
    private void fillBuffer() throws IOException {
        bytesRead = stream.read(buffer, bufferPointer = 0, BUFFER_SIZE);
        if (bytesRead == -1) buffer[0] = -1;
    }
    private byte read() throws IOException {
        if (bufferPointer == bytesRead) fillBuffer();
        return buffer[bufferPointer++];
    }
    public void close() throws IOException {
        stream.close();
    }
    public String allLines() throws IOException {
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        for (int length; (length = stream.read(buffer)) != -1; ) result.write(buffer, 0, length);
        return result.toString("UTF-8");
    }
}
*/