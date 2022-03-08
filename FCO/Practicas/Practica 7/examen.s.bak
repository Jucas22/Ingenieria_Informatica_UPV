.data 0x10001000
vector: .half -12, 20, 8,-1, 15,-8
n: .word 6
calc1: .space 4
calc2: .space 4
.text 0x00400000
.globl __start
__start:
la $2, vector
la $3,n
lw $3,0($3)
add $4,$0,$0
add $5,$0,$0
add $6,$0,$0
loop: lh $8,0($2)
 addi $6,$6,1
slt $9,$8,$0
beq $9,$0,salto1
addi $4,$4,1
j salto2
salto1: addi $5,$5,1
salto2: addi $2,$2,2
slt $9,$6,$3
bne $9,$0,loop
 la $2, calc1
 sw $4,0($2)
 sw $5,4($2)
.end.