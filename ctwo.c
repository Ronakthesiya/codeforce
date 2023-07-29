#include<stdio.h>

int main(){
    int t;
    scanf("%d",&t);

    while(t-->0){
        int n,k;
        scanf("%d %d",&n,&k);
        int a[n],b[n],c[n];

        for(int i=0;i<n;i++){
            scanf("%d",&a[i]);
            c[i]=a[i];
        }
        for(int i=0;i<n;i++){
            scanf("%d",&b[i]);
        }

        for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(a[i]>a[j]){
                        int temp=a[j];
                        a[j]=a[i];
                        a[i]=temp;
                    }

                    if(b[i]>b[j]){
                        int temp=b[j];
                        b[j]=b[i];
                        b[i]=temp;
                    }
                }
            }

            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    if(a[j]==c[i]){
                        int temp=a[j];
                        a[j]=a[i];
                        a[i]=temp;

                        printf("%d ",b[j]);

                        temp=b[j];
                        b[j]=b[i];
                        b[i]=temp;

                        break;
                        
                    }
                }
            }
            printf("\n");
        }
    }
