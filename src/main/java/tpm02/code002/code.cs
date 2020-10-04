bool camelCaseSeparation(string[] words, string variableName) {
    const int maxLength = 1000;
    var result = false;
    if (null == words || 0 == words.Length || maxLength < words.Length)
        return result;
    if (string.IsNullOrEmpty(variableName) || maxLength < variableName.Length)
        return result;
    
    var resultCollection = words.ToList()
        // .ForEach(word => Console.WriteLine(word));
        .Select(word => {
            var lowerWord = word.ToLower();
            var lowerVariable = variableName.ToLower();
            var titleCasedWord = lowerWord.Substring(0, 1).ToUpper() + lowerWord.Substring(1);
            if (lowerWord.Equals(lowerVariable)) {
                if (!lowerVariable.Contains(lowerWord)) {
                    if (!lowerVariable.Contains(lowerWord) && !lowerVariable.Contains(titleCasedWord)) {
                        return result;
                    }
                    return true;
                } else {
                    if (!lowerVariable.Contains(titleCasedWord)) {
                        return result;
                    }
                    return true;
                }
            }
            return false;
        });
    
    return !resultCollection.Contains(false);
}
