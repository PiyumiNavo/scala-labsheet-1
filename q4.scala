@main def main = println(totalWholeSaleCost(50))

def totalWholeSaleCost(numCopies:Int):Double = {
  discountedCost(numCopies) + shippingCost(numCopies)
}   

def shippingCost(numCopies:Int):Double = {
  if(numCopies<=50) 3*numCopies
  else 3*50 + (numCopies-50)*0.75
}

def discountedCost(numCopies:Int):Double = 24.95*numCopies*0.6
