@main def main = println(totalRunTime(2,3))


def easyRunTime(distance:Double):Double = 8*distance

def tempoRunTime(distance:Double):Double = 7*distance

def totalRunTime(easyD:Double,tempoD:Double):Double = easyRunTime(easyD) + tempoRunTime(tempoD) + easyRunTime(easyD)