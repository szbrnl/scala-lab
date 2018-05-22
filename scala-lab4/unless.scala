def unless(w : => Boolean)(tr : => Unit)(fal : => Unit) : Unit = {
if(w) {
 tr
 }
 else {
 fal
 }
}

