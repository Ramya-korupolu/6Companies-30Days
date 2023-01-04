class Solution:
    def getHint(self, secret: str, guess: str) -> str:
        bulls = 0
        length = len(secret)
        sec_dict, guess_dict = {}, {}

        for i in range(length):
            if secret[i] == guess[i]:
                bulls += 1
            else:
                sec_dict = self.setDict(sec_dict, secret[i])
                guess_dict = self.setDict(guess_dict, guess[i])
        
        cows = 0
        for char in sec_dict.keys():
            if char in guess_dict.keys():
                cows += min(sec_dict[char], guess_dict[char])
        
        return str(bulls) + "A" + str(cows) + "B"


    def setDict(self, dictonary: dict, char: str):
        if char in dictonary.keys():
            dictonary[char] += 1
        else:
            dictonary[char] = 1
        return dictonary

