original_word = "SOL"
reverse_word = "SOL"

left_i = -1

answer = True

for right_i in range(len(original_word)):
    print("->" ,original_word[right_i] , "(", right_i, ")", reverse_word[left_i], "(", left_i, ")",)
    if original_word[right_i] != reverse_word[left_i]:
        answer = False
        break
    
    left_i = left_i -1


print(answer)
