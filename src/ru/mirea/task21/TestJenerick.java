package ru.mirea.task21;

import java.util.ArrayList;
import java.util.List;

public class TestJenerick {
    List<Client> clientList= new ArrayList<>();
    List<Worker> workerList=new ArrayList<>();
    void addClient(Client client)
    {
        clientList.add(client);
    }
    void addWorker(Worker worker)
    {
        workerList.add(worker);
    }
    public static void main(String[]args)
    {
        TestJenerick testJenerick=new TestJenerick();
        for (int i=0;i<5;i++)
        {
            Client client=new Client("TestName "+i,""+i,""+(int)(Math.random()*50000));
            Worker worker=new Worker("TestWorkerName"+i,""+(int)(Math.random()*10000),i);
            testJenerick.addClient(client);
            testJenerick.addWorker(worker);
        }
        System.out.println("Clients:");
        for (int i=0;i<5;i++)
        System.out.println(testJenerick.clientList.get(i).toString());
        System.out.println("Workers:");
        for (int i=0;i<5;i++)
            System.out.println(testJenerick.workerList.get(i).toString());

    }
}
