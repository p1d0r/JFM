package ru.mirea.task25;

public class Task {
    public static void main(String[]args)
    {
        int total;
        System.out.println("В банке можно взять кредит по 15% годовых. Однако он может быть понижен, если будет выполнено одно из следующих условий");
        System.out.println("Вы обладатель VIP статуса - на 8%");
        System.out.println("Вы планируете взять кредит на долгий срок - на 3%");
        System.out.println("Вы планируете взят в кредит большую сумму - на 2%");
        Percent credit=new Credit();
        Percent vipStatus=new VipStatus(credit);
        Percent longPeriod=new LongPeriod(vipStatus);
        Percent bigSumm=new BigSum(longPeriod);
        total=bigSumm.getPercent();
        System.out.println("В таком случае минимально возможный процент, который доступен равен:");
        System.out.println(total+"%");
    }
}
