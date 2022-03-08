			.text 0x00400000
			.globl __start
__start:
			addi $8, $0, 10000
			mult $8, $8
			mflo $9
			mult $8, $9
			.end