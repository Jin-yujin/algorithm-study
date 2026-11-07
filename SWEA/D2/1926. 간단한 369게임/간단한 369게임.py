def game_369(n):
    result = []
    for i in range(1, n + 1):
        count = str(i).count('3') + str(i).count('6') + str(i).count('9')
        if count > 0:
            result.append('-' * count)
        else:
            result.append(str(i))
    return ' '.join(result)

# 입력
T = int(input())

# 출력
print(game_369(T))
