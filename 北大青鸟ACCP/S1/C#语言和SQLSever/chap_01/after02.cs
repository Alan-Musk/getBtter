using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Library
{
    class Program
    {
        public static void Main(string[] args)
        {
            string email;//邮箱
            string name;//会员名
            int password;//用户密码
            int repet;//重复密码
            Console.WriteLine("请输入要注册的邮箱");
            email = Console.ReadLine();
            Console.WriteLine("请输入要注册的会员名");
            name = Console.ReadLine();
            Console.WriteLine("请输入用户的密码");
            password = int.Parse(Console.ReadLine());
            Console.WriteLine("请重复用户的密码");
            repet = int.Parse(Console.ReadLine());

            Console.WriteLine("注册的邮箱是:{0}\n注册的用户名是:{1}\n" +
                "用户的密码:{2}\n用户重复的密码:{3}",email,name,password,repet);
        }
    }
}