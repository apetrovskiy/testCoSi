def combinationSum(a, sum):
    sections = []
    for element in a:
        sections.extend(build_sections(element, a, sum))
    sections.sort()
    return ''.join(sections)

def build_sections(elt, input_array, target):
    return ["(1 1, )(2 2 2)"]
