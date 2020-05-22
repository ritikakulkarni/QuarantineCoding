importjava.util.Scanner;
publicclass GFG1
{
// Method to find the waiting time for all
// processes
staticvoidfindWaitingTime(intprocesses[], intn,
intbt[], intwt[], intquantum)
{
// Make a copy of burst times bt[] to store remaining
// burst times.
intrem_bt[] = newint[n];
for (inti = 0 ; i<n ; i++)
rem_bt[i] = bt[i];
intt = 0; // Current time
// Keep traversing processes in round robin manner
// until all of them are not done.
while(true)
{
booleandone = true;
// Traverse all processes one by one repeatedly
for (inti = 0 ; i<n; i++)
{
// If burst time of a process is greater than 0
// then only need to process further
if (rem_bt[i] > 0)
{
done = false; // There is a pending process

if (rem_bt[i] >quantum)
{
// Increase the value of t i.e. shows
// how much time a process has been processed
t += quantum;

// Decrease the burst_time of current process
// by quantum
rem_bt[i] -= quantum;
}

// If burst time is smaller than or equal to
// quantum. Last cycle for this process
else
{
// Increase the value of t i.e. shows
// how much time a process has been processed
t = t + rem_bt[i];

// Waiting time is current time minus time
// used by this process
wt[i] = t - bt[i];

// As the process gets fully executed
// make its remaining burst time = 0
rem_bt[i] = 0;
}
}
}

// If all processes are done
if (done == true)
break;
}
}

// Method to calculate turn around time
staticvoidfindTurnAroundTime(intprocesses[], intn,
intbt[], intwt[], inttat[])
{
// calculating turnaround time by adding
// bt[i] + wt[i]
for (inti = 0; i<n ; i++)
tat[i] = bt[i] + wt[i];}

// Method to calculate average time
staticvoidfindavgTime(intprocesses[], intn, intbt[],
intquantum)
{
intwt[] = newint[n], tat[] = newint[n];
inttotal_wt = 0, total_tat = 0;

// Function to find waiting time of all processes
findWaitingTime(processes, n, bt, wt, quantum);

// Function to find turn around time for all processes
findTurnAroundTime(processes, n, bt, wt, tat);

// Display processes along with all details
System.out.println("Processes " + " Burst time " +
" Waiting time " + " Turn around time");

// Calculate total waiting time and total turn
// around time
for (inti=0; i<n; i++)
{
total_wt = total_wt + wt[i];
total_tat = total_tat + tat[i];
System.out.println(" " + (i+1) + "\t\t" + bt[i] +"\t " +
wt[i] +"\t\t " + tat[i]);
}

System.out.println("Average waiting time = " +
(float)total_wt / (float)n);
System.out.println("Average turn around time = " +
(float)total_tat / (float)n);
}

// Driver Method
publicstaticvoid main(String[] args)
{
// process id's
Scanner s = new Scanner(System.in);
System.out.print("Enter no. of processes:");
intn = s.nextInt();
intprocesses[] = newint[n];

for(inti = 0; i<n; i++)
        {
processes[i] = i;

        }

intburst_time[]= newint[n];
System.out.print("Enter burst time:");



for(inti = 0; i<n; i++)
        {
burst_time[i] = s.nextInt();

        }

// Time quantum
System.out.print("Enter time quantum:");        
intquantum = s.nextInt();
findavgTime(processes, n, burst_time, quantum);
}
}
