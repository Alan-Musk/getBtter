using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace BankName{
    //通过输入银行简称来输出银行全称
    class FullBankName
    {
        //根据从控制台输入的简称来输出银行全称
        public void BankNameOutPut()
        {
            Console.WriteLine("请输入银行简称");
            //将输入的银行简称转换为大写字母
            string bank = Console.ReadLine().ToUpper();
            switch (bank)
            {
                case "ICBC":
                    Console.WriteLine("中国工商银行");
                    break;
                case "CBC":
                    Console.WriteLine("中国建设银行");
                    break;
                case "ABC":
                    Console.WriteLine("中国农业银行");
                    break;
                default:
                    Console.WriteLine("输入银行简称错误");
                    break;
            }
            Console.ReadLine();
        }
    }
    class Program
    {
        public static void Main(string[] args)
        {
            FullBankName bankName = new FullBankName();
            bankName.BankNameOutPut();
        }
    }
}
