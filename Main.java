// You can delete the imports that aren't needed, but you don't have to since the compiler automatically deletes unused imports.
// Also don't worry about comments because the compiler automatically removes them before running the program :)
import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.awt.*;
import java.lang.*;
import java.math.*;
import javax.swing.*;
import java.time.*;
import java.time.format.*;

// This code was based on the GeeksForGeeks template (https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/) as well as the USACO Fast IO Template (https://usaco.guide/general/fast-io?lang=java and https://usaco.guide/general/input-output?lang=java)
public class Main {
    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream stream;
    private byte[] buffer = new byte[BUFFER_SIZE];
    private int bufferPointer = 0, bytesRead = 0;
    public Main() {
        stream = new DataInputStream(System.in);
    }
    /*
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
    */
    
    public String next() throws IOException
    {
        byte[] buf = new byte[100000]; // line length
        int cnt = 0, c;
        while ((c = read()) != -1) {
            if (c == ' ') if (cnt != 0) break;
            buf[cnt++] = (byte)c;
        }
        return new String(buf, 0, cnt);
    }
    
    
    public String nextLine() throws IOException
    {
        byte[] buf = new byte[100000]; // line length
        int cnt = 0, c;
        while ((c = read()) != -1) {
            if (c == '\n') if (cnt != 0) break;
            buf[cnt++] = (byte)c;
        }
        return new String(buf, 0, cnt);
    }
    
    /*
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
    */

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
    
    public byte nextByte() throws IOException { return Byte.parseByte(next()); }
    public short nextShort() throws IOException { return Short.parseShort(next()); }
    //public float nextFloat() throws IOException { return Float.parseFloat(next()); }
    //public double nextDouble() throws IOException { return Double.parseDouble(next()); }
    
    private void fillBuffer() throws IOException {
        bytesRead = stream.read(buffer, bufferPointer = 0, BUFFER_SIZE);
        if (bytesRead == -1) buffer[0] = -1;
    }

    private byte read() throws IOException {
        if (bufferPointer == bytesRead) fillBuffer();
        return buffer[bufferPointer++];
    }
    
    /*
    public void close() throws IOException {
        if (stream == null) return;
        stream.close();
    }
    */
	
    public static void main(String[] args) throws Exception {
        Main io = new Main();
        DataOutputStream dos = new DataOutputStream(System.out);
        StringBuilder sb = new StringBuilder();
        
	int a = io.nextInt(), b = io.nextInt(), c = io.nextInt();
	sb.append("The sum of these three numbers is: ").append(a+b+c).append("\n");

        dos.write((sb.toString()).getBytes());
        
        //io.close(); // You don't have to close the DataInputStream (you probably should, but not doing so allows you to make your code even faster)
        dos.flush();
        dos.close();
    }
}