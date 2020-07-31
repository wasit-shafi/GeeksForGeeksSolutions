#include<bits/stdc++.h>
using namespace std;

void print_array(int arr[], int n) { for(int i = 0 ; i < n ; i++) cout << arr[i] << " "; }

int main()
{
	int arr[] = {1, 2, 3, 5, 1, 2, 3, 44 ,33, 11, 22, 3, 4, 5, 6, 11, 78, 8, 9, 2, 3, 4, 5, 6, 72,2, 2};
	int n = sizeof(arr) / sizeof(arr[0]);

	cout << "Array : ";
	sort(arr, arr+n);
	print_array(arr, n);

	int x = 2;
	auto *itr_first = lower_bound(arr, arr+n, x);
	auto *itr_last =  upper_bound(arr, arr+n, x);
	cout << "\nTotal Occurences : " << itr_last - itr_first;
	return 0;
}
