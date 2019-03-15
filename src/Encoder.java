
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MemeLord
 */
public class Encoder extends Dictionary {
    public List encode(String src)
    {
        init(); // khoi tao cho bang ma
        List result = new ArrayList<>();   
        StringBuilder p = new StringBuilder(); //dat ra mot stringbuider de luu lai tam thoi
        for(int i = 0;i<src.length();i++)
        {
            char c = src.charAt(i);
            int di = find(p.toString()+c); // tim ra phan tu cua xau ung voi vi tri trong bang ma
            /**
             * nếu không tìm được, sẽ thêm một xâu mới có tồn tại xâu lưu lại vừa rồi cộng với
             * kí tự đơn vừa tìm thấy
             */
            if(!isFounded(di))
            {
                result.add(find(p.toString()));
                System.out.println("Add "+find(p.toString())+"("+p+")");
                addLib(p.toString()+c);
                p.setLength(0);
            }
            /*
            lưu lại vào xâu tạm
            */
            p.append(c);
        }
        
        result.add(find(p.toString()));
        System.out.println("Add "+find(p.toString())+"("+p+")");
        System.out.println("After encoding");
        return result;
    }
}
