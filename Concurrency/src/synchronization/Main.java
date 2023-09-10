package synchronization;

public class Main {
}


// what is synchronization problem ?
// - when multiple threads are working on same data at the same time,
//   it can lead to inconsistent values, potentially wrong results

// CRITICAL SECTION - part of your code where potential issues might happen, so we need to be careful about that part
// of the code which is working on shared piece of data, majorly critical section is where manipulation of data is happening

// RACE CONDITION - more than one thread trying to enter Critical section at the same time

// Solve -> even if we have CS in our code, and we are working multi threaded code, we want consistent results
// Properties of good soln of synchronization problem -

// 1. Mutual Exclusion - make sure only 1 thread enters the CS of code at one time
// 2. Progress - The entire system should be making progress, there should not be any scenario where everything is in
//               a wait state(CS)
// 3. Bounded waiting - * No thread should wait indefinitely
//                      * there should be a bound for how long a thread will wait.
// 4. No busy waiting - other thread should not keep on continuously checking whether they can enter CS.
//                      the thread which is currently executing CS should notify other threads that once done

// Solution to synchronization problem
// 1. Mutex(MUTual EXclusion)
// 2. Synchronization
// 3. Semaphores

// 1. Mutual Exclusion(Mutex) -  lock that allows mutual exclusion
//    a thread that must lock when it tries to enter a CS and gets unlock when it leaves the CS

// Properties of mutex lock(ME, progress, no busy waiting, bounded waiting)
// - only one thread can unlock the thread at one time (ME)
// - other threads will wait until the initial thread unlocks
// - mutex will notify the next thread to start execution when the initial thread completes (no busy waiting)
// - it supports bounded waiting

// * LOCK - try to keep the locked section as small as possible
// - bigger the lock area, more expensive in terms of time and space
// - bigger the lock area reduces the capabilities of multiple thread to execute parallely
// - lock - maintain consistency, reduce performance