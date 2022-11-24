// For more info refer : https://www.youtube.com/watch?v=yB57bcffJo4
//                      https://www.geeksforgeeks.org/sieve-of-eratosthenes

#include<iostream>
using namespace std;

int main()
{
    int n = 100;
    bool primes[n + 1];

    for(int i = 0 ; i <= n ; i++) primes[i]  = true;

    for(int i = 2 ; i * i <= n ; i++)
        if(primes[i] == true)
            for(int j = i * i ; j <= n ; j = j + i)
               primes[j] = false;

    cout << "Prime no. upto " << n << " : ";
    for(int i = 2 ; i < n ; i++)
        if(primes[i])
            cout << i << " ";

    return 0;
}