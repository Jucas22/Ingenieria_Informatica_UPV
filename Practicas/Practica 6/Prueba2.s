			.text 0x00400000
			.globl __start
__start:
			addi $8, $0, 1
			addi $9, $0, -2
			add $10, $8, $9
			.end