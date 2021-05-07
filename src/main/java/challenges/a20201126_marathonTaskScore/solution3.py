def marathonTaskScore(marathonLength, maxScore,
                      submissions, successfulSubmissionTime):
    final_score = maxScore
    final_score = final_score - successfulSubmissionTime * \
        (maxScore / 2) * (1 / marathonLength)
    if submissions > 1:
        final_score = final_score - (submissions - 1) * 10
    if final_score < maxScore / 2:
        final_score = maxScore / 2
    if successfulSubmissionTime == -1:
        final_score = 0
    return final_score
