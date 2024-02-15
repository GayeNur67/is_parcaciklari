package _19010310021_IsletımSistemi;
import java.util.LinkedList;

public class CPU {
	private LinkedList<Process> readyQueue;
    private Process currentProcess;

    public CPU() {
        readyQueue = new LinkedList<Process>();
        currentProcess = null;
    }

    public void addProcess(Process process) {
        readyQueue.add(process);
    }

    public void run() {
        int count = 0;
        while(!readyQueue.isEmpty()) {
            if(currentProcess == null || count == 5) {
                currentProcess = readyQueue.remove();
                count = 0;
            }
            boolean completed = currentProcess.isAlive();
            if(completed) {
                System.out.println(currentProcess.equals(currentProcess) + " completed");
                currentProcess = null;
            }

            count++;

            if (count == 10 && readyQueue.isEmpty()) {
                break;
            }
        }     
        }
    }


