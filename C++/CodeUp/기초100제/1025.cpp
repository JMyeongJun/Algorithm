#include <stdio.h>

int main() {
	int a, b=10000;
	scanf("%d", &a);
	while(a != 0) {
		printf("[%d]\n", a/b*b);
		a %= b;
		b /= 10;
	}
	return 0;
}