# def camelCaseSeparation(words, variableName):
from typing import List


def camelCaseSeparation(words: List[str], variableName: str):
    if len(words) < 1 or len(words) > 10 ** 3:
        return False
    if len(variableName) < 1 or len(variableName) > 10 ** 3:
        return False
    
    result: bool = False
    for word in words:
        if word.lower() in variableName.lower():
            if variableName.lower().index(word.lower()) == 0:
                if word.lower() not in variableName and word.lower().capitalize() not in variableName:
                    return False
            else:
                if word.lower().capitalize() not in variableName:
                    return False
    
    print(words)
    print(variableName)
    return True

print(camelCaseSeparation(["is", "valid", "right"], "isValid"))
