package sqltest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//连接数据库需要知道，数据库的ip地址(master)，端口号，用户名，密码 要连接的数据库名称
//通过可视化工具Navicat，找到端口号，通过虚拟机中的网络连接知道ip
//ip:192.168.116.130  port:3306 username:alen  password:alen
public class test {
    public static void main(String[] args) throws  Exception{
        //1.以映射方式加载Driver,抛出异常
        //Class.forName("com.mysql.jdbc.Driver");
        //2.建立连接，ip地址写清楚就能连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.94.128:3306/student", "alen", "alenalen");
        //3.执行sql语句
        //方式一
        //3.1.1创建sql语句
        String sql="select * from grades where SCORE > 80;";//在这里注意，有时候语句没问题，但执行时结果报错，可能是编译器问题，字段识别错误
        //3.1.2通过创建的连接对象创建执行器,用来执行sql语句
        Statement statement = conn.createStatement();
        //3.1.3通过执行器执行sql语句，得到结果集
        ResultSet rs = statement.executeQuery(sql);
        //3.1.4将执行的结果在控制台显示
        while(rs.next()){
            int ID = rs.getInt("ID");
            String NAME = rs.getString("NAME");
            float SCORE = rs.getFloat("SCORE") ;
            String SEX = rs.getString("SEX");
            System.out.println(ID+"--"+NAME+"--"+SCORE+"--"+SEX);
        }
        conn.close();
        statement.close();
        rs.close();

    }
}