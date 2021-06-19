using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace MyBank
{
    //账户类
    class UserName
    {
        //账户
        public string _account = "123";
        //用户名
        public string _name;
        //密码
        public string _password;
        //存款金额
        public double _balance;
        //身份证
        public string _ID;
        //返回余额
        public double MinusMoney(double money)
        {
            if (money > 0)
            {
                if (money <= _balance)
                {
                    _balance -= money;
                    return _balance;
                }
                else
                {
                    return -1;
                }
            }
            else
            {
                return -1;
            }
        }
    }
    //银行类
    class Bank
    {
        UserName user = new UserName();
        //开户
        public void Create()
        {
            Console.WriteLine("请输入用户名");
            user._name = Console.ReadLine();
            Console.WriteLine("请输入用户密码");
            user._password = Console.ReadLine();
            Console.WriteLine("请输入用户身份号码");
            user._ID = Console.ReadLine();
            Console.WriteLine("请输入用户存款金额");
            user._balance = double.Parse(Console.ReadLine());
            Console.WriteLine("账户:{0},用户名:{1},存款金额{2}创建成功\n", user._name, user._name, user._balance);
        }
        //取款
        public void getMoney()
        {
            //账户
            string account = "";
            //密码
            string pwd = "";
            //取得金额
            double money = 0;
            //判断是否取款成功
            double result = -1;
            //检测输入账户
            Console.WriteLine("请输入账号");
            account = Console.ReadLine();
            if (account.Length == 0)
            {
                Console.WriteLine("输入的账户不正确");
                return;
            }
            //检测输入密码
            Console.WriteLine("请输入账户密码");
            pwd = Console.ReadLine();
            if (account == user._account && pwd != user._password)
            {
                Console.WriteLine("密码有误");
                return;
            }
            //检测取款金额
            Console.WriteLine("请输入取款金额");
            money = double.Parse(Console.ReadLine());
            result = user.MinusMoney(money);
            if (result == -1)
            {
                Console.WriteLine("取款失败");
            }
            else
            {
                Console.WriteLine("取款成功!当前余额是:{0}", result);
            }

        }
        //菜单
        public void ShowCustomMenu()
        {
            do
            {
                //switch选择
                string choose = "";
                Console.WriteLine("=========欢迎使用自助银行服务========");
                Console.WriteLine("1.存款 2.取款 3.转账 4.查询余额 5.退出");
                Console.WriteLine("==================================");
                choose = Console.ReadLine();
                switch (choose)
                {
                    //存款
                    case "1":
                        continue;
                    //取款
                    case "2":
                        getMoney();
                        continue;
                    //转账
                    case "3":
                        continue;
                    //查询余额
                    case "4":
                        continue;
                    //退出
                    case "5":
                        break;
                    default:
                        Console.WriteLine("输入无效");
                        continue;
                }
                break;
            } while (true);
        }

    }
    //main方法类
    class Program
    {
        public static void Main(string[] args)
        {
            Bank bank = new Bank();
            bank.Create();
            bank.ShowCustomMenu();
        }
    }
}