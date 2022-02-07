#include <stdio.h>

int main() {
	long long int a, b, c;
	scanf("%lld %lld %lld", &a, &b, &c);
	printf("%lld\n", a + b + c);
	printf("%.1lf\n", ((float)a + (float)b + (float)c)/3);
	return 0;
}