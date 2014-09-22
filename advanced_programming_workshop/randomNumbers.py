import random

file = open("randomNumbers0-9.txt", 'w')

for i in range(1, int(random.random()*5000+1000)) :
	file.write(repr(int(random.random()*10)))
	file.write(', ')

file.close()


