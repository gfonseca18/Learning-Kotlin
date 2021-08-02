// hashMap - Key: Value (It's more like dicionary )

var hashMap = hashMapOf<Any, Any>()
hashMap.put("Angola", "Tatiana")
hashMap.put("Brasil", "Xuxu")
hashMap.put("Argentina", "Madresca")
hashMap.put("Portugal", "Ruth")

for (v in hashMap.values) {
    println(v)
}
