	.data 0x10000000
	.globl __start
__start:
	.byte 1,-1,2
	.half -2, 3
	.byte 4
	.word -4
	.byte 5
	.half 6
.end