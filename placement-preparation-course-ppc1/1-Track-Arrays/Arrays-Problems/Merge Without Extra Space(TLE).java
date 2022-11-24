// { Driver Code Starts
#include <bits/stdc++.h> 
using namespace std; 


 // } Driver Code Ends


// Function to merge two input arrays
// arr1[], arr2[]: input arrays
// n, m: size of arr1[] and arr2[] respectively
void merge(int arr1[], int arr2[], int n, int m) 
{
    // The below algorithm also solves problem but take much time (TLE occurs)
    int i, j, temp;
        i = j = 0;
        
        while(i < n)
        {
            if(arr1[i] < arr2[0])
                i++;
            else
            {
                temp = arr1[i];
                arr1[i] = arr2[0];
                j = 1;
                
                while(j < m && arr2[j] < temp)
                {
                    arr2[j-1] = arr2[j];
                    j++;
                }
                arr2[j-1] = temp;
                while(arr2[j]>arr1[i]) j--;
                
                i++;
            }
        }
} 


// { Driver Code Starts.

int main() 
{ 
	
	int T;
	cin >> T;
	
	while(T--){
	    int n, m;
	    cin >> n >> m;
	    
	    int arr1[n], arr2[m];
	    
	    for(int i = 0;i<n;i++){
	        cin >> arr1[i];
	    }
	    
	    for(int i = 0;i<m;i++){
	        cin >> arr2[i];
	    }
	    
	    merge(arr1, arr2, n, m); 

        for (int i = 0; i < n; i++) 
            printf("%d ", arr1[i]); 
        
       
	    for (int i = 0; i < m; i++) 
		    printf("%d ", arr2[i]); 
	    
	    cout<<endl;
	}

	return 0; 
} 
  // } Driver Code Ends