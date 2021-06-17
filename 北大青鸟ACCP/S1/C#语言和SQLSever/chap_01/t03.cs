using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace MyBank{
    //账户类
    public class User
    {
        //账户姓名
        public string _name;
        //密码
        public string _password;
        //身份证号码
        public string _identityNum;
        //存款余额
        public double _balance;
        //账号
        public string _account;
    }
    //银行类
    public class Bank
    {
        //开户
        public void CreateAccount()
        {
            //实例化User对象并赋值
            User user = new User();

            //接收输入的数据
            Console.WriteLine("请输入用户名");
            user._name = Console.ReadLine();
            user._account = "179708064356";
            Console.WriteLine("请输入用户密码");
            user._password = Console.ReadLine();
            Console.WriteLine("请输入用户身份证号");
            user._identityNum = Console.ReadLine();
            Console.WriteLine("请输入用户存款金额");
            user._balance = double.Parse(Console.ReadLine());

            Console.WriteLine("账户:{0},用户名:{1},存款金额:{2} 创建成功!",user._account,user._name,user._balance);
            Console.ReadLine();
        }
    }
    class Program
    {
        public static void Main(string[] args)
        {
            Bank bank = new Bank();
            bank.CreateAccount();
        }
    }
}