/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MemeLord
 */
public class Main {
    /**
     * Chú ý: Đây chỉ là hướng làm việc của thuật toán nén LZW,
     * Nếu về mặt lập trình và ngôn ngữ máy tính thì thuật toán viết ở đây hoàn toàn sai
     * @param args 
     */
    public static void main(String[] args) {
        String eg = "ABABABABAB";
        Encoder e = new Encoder();
        System.out.println("Before encoding: "+eg);
        System.out.println(e.encode(eg));
    }
}
