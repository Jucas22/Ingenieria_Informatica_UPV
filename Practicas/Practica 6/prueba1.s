.text 0x00400000
.globl __start
__start:
			addi $7, $0, 0x1234
			addi $8, $0, 0x5678
			addi $9, $8, -1
			add $6, $7, $8
.end