package day0725.Test105;


import java.util.List;
import day0725.Test105.temp.BangMyungDAO;
import day0725.Test105.temp.BangMyungVO;
//import day0725.Test105.temp.*; 만약에 다른파일이 있을경우 에러 날 수 있음
public class Test105 {
    public static void main(String[] args) throws Exception{
        BangMyungDAO.addGul("끝이 보이냐");
        List<BangMyungVO> ls = BangMyungDAO.findAll();

        for ( BangMyungVO vo:ls ) {
            System.out.println(vo.getNo()+"\t" + vo.getGul() +"\t" +vo.getTheTime());

        }
    }
}
