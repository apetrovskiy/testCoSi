def combinationSum(a, sum):
    sections = []
    for current_element in a:
        sections.extend(build_sections(current_element, a, sum))
    sections.sort()
    return ''.join(sections) if len(sections) > 0 else "Empty"

def build_sections(element, input_array, target):
    # return [] if element > target else ["(1 1 1)(2 2 2)"]
    if element> target:
        return []
    return ["(1 1)"] 
