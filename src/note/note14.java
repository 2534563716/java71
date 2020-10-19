package note;

import java.util.Scanner;

public class note14 {
    public static void main(String[] args) {
        String[] names = new String[4];
        String[] dishMsgs = new String[4];
        int[] times = new int[4];
        String[] addresses = new String[4];
        int[] states = new int[4];
        double[] sumPrices = new double[4];

        names[0] = "张晴";
        dishMsgs[0] = "红烧带鱼2份";
        times[0] = 12;
        addresses[0] = "天成路207号";
        sumPrices[0] = 76.0;
        states[0] = 1;

        names[0] = "张晴";
        dishMsgs[0] = "鱼香肉丝2份";
        times[0] = 18;
        addresses[0] = "天成路207";
        sumPrices[0] = 45.0;
        states[0] = 0;

        String[] dishNames = {"红烧带鱼", "时令蔬菜", "酸辣土豆丝"};
        double[] prices = {38, 20, 10};
        int[] praiseNums = new int[6];

        System.out.println("***********欢迎进入《吃货联盟》点餐系统***********");
        Scanner input = new Scanner(System.in);
        int num;
        boolean isExit = false;
        do {
            System.out.println("1:我要订餐");
            System.out.println("2:查看餐袋");
            System.out.println("3:签收订单");
            System.out.println("4:删除订单");
            System.out.println("5:我要点赞");
            System.out.println("6:退出系统");
            System.out.println("**********************");
            System.out.println("请选择：");
            int choose = input.nextInt(); // 根据用户的选择执行不同的功能
            switch (choose) {
                case 1:
                    System.out.println("************我要订餐************");
                    boolean addFlag = false;
                    for (int i = 0; i < names.length; i++) {
                        if (names[i] == null) {
                            addFlag = true;
                            System.out.println("请输入订餐人的姓名：");
                            String name = input.next();
                            System.out.println("您可以选择下列的菜品：");
                            System.out.println("序号\t\t菜名\t\t\t单价\t\t\t点赞数");
                            for (int j = 0; j < dishNames.length; j++) {
                                String praiseNum = (praiseNums[j] > 0) ? praiseNums[j]
                                        + "个赞"
                                        : "";
                                System.out.println(j + 1 + "\t\t" + dishNames[j]
                                        + "\t\t" + prices[j] + "\t\t"
                                        + praiseNum);
                            }
                            System.out.println("请您选择菜品的编号：");
                            int chooseDish = input.nextInt();
                            System.out.println("请您输入点餐的份数：");
                            int number = input.nextInt();
                            String dishMsg = dishNames[chooseDish - 1] + "" + number + "份";
                            System.out.println("请您输入送餐的地址：");
                            String address = input.next();
                            System.out.println("请您输入送餐的时间：送餐时间是10点到20点之间");
                            int time = input.nextInt();
                            while (time > 20 || time < 10) {
                                System.out.print("请重新输入送餐时间：");
                                time = input.nextInt();
                            }
                            double sumPrice = prices[chooseDish - 1] * number;
                            double deliCharge = (sumPrice > 50) ? 0 : 5;
                            System.out.println("恭喜您订餐成功！");
                            System.out.println("您定的菜品是："
                                    + dishMsg);
                            System.out.print("餐费：" + sumPrice);
                            System.out.print("\t送餐费：" + deliCharge);
                            System.out.println("\t总费用：" + (deliCharge + sumPrice));

                            names[i] = name;
                            dishMsgs[i] = dishMsg;
                            times[i] = time;
                            addresses[i] = address;
                            sumPrices[i] = sumPrice + deliCharge;
                            break;
                        }
                    }
                    if (!addFlag) {
                        System.out.println("餐袋已经满了");
                    }
                    break;
                case 2:
                    System.out.println("************查看餐袋************");
                    System.out.println("序号\t订餐人\t餐品信息\t\t送餐时间\t送餐地址\t总金额\t订单状态");
                    for (int i = 0; i < names.length; i++) {
                        if (names[i] != null) {
                            String state = (states[i] == 0) ? "已预订" : "已完成";
                            String date = times[i] + "点";
                            String sumPrice = sumPrices[i] + "元";
                            System.out.println((i + 1) + "\t" + names[i] + "\t" + dishMsgs[i] + "\t" + date + "\t" + addresses[i] + "\t" + sumPrice + "\t" + state);
                        }
                    }
                    break;
                case 3:
                    System.out.println("************签收订单************");
                    boolean isSignFind = false;
                    System.out.print("请输入要签收的订单序号");
                    int signOrderId = input.nextInt();
                    for (int i = 0; i < names.length; i++) {
                        if (names[i] != null && states[i] == 0 && signOrderId == i + 1) {
                            states[i] = 1;
                            System.out.println("订单签收成功");
                            isSignFind = true;
                        } else if (names[i] != null && states[i] == i && signOrderId == i + 1) {
                            System.out.println("您选择的订单签收已完成，不能再次签收");
                            isSignFind = true;
                        }
                    }
                    if (!isSignFind) {
                        System.out.println("您的订单不存在");
                    }
                    break;
                case 4:
                    System.out.println("************删除订单************");
                    boolean isDelFind = false;
                    System.out.print("请输入要删除的订单号");
                    int delld = input.nextInt();
                    for (int i = 0; i < names.length; i++) {
                        if (names[i] != null && states[i] == 1 && delld == i + 1) {
                            isDelFind = true;
                            for (int j = delld - 1; j < names.length - 1; j++) {
                                names[j] = names[j + 1];
                                dishMsgs[j] = dishMsgs[j + 1];
                                times[j] = times[j + 1];
                                addresses[j] = addresses[j + 1];
                                sumPrices[j] = sumPrices[j + 1];
                                states[j] = states[j + 1];
                            }
                            int endIndex = names.length - 1;
                            names[endIndex] = null;
                            dishMsgs[endIndex] = null;
                            times[endIndex] = 0;
                            addresses[endIndex] = null;
                            states[endIndex] = 0;
                            sumPrices[endIndex] = 0;
                            System.out.println("删除订单成功");
                            break;
                        } else if (names[i] != null && states[i] == 0 && delld == i + 1) {
                            System.out.println("您选择的订单未签收，不能删除");
                            isDelFind = true;
                            break;
                        }
                    }
                    if (!isDelFind) {
                        System.out.println("您要删除的订单不存在");
                        break;
                    }
                case 5:
                    System.out.println("************我要点赞************");
                    for (int i = 0; i < dishNames.length; i++) {
                        String price = prices[i] + "元";
                        String priaiseNum = (praiseNums[i] > 0 ? praiseNums[i] + "赞" : "");
                        System.out.println((i + 1) + "\t" + dishNames[i] + "\t" + price + "\t" + priaiseNum);
                    }
                    System.out.println("请选择您要点赞的菜品");
                    int priaiseNum = input.nextInt();
                    praiseNums[priaiseNum - 1]++;
                    if (priaiseNum<=3) {
                        System.out.println("点赞成功");
                    }else {
                        System.out.println("菜品不存在");
                    }
                    break;
                case 6:
                    isExit = true;
                    break;
                default:
                    isExit = true;
                    break;
            }
            if (!isExit) {
                System.out.println("输入0返回");
                num = input.nextInt();
            } else {
                break;
            }
        } while (num == 0);
    }
}
