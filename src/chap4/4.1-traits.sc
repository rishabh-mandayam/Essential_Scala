import java.util.Date

case class Anonymous(id: String, createdAt: Date = new Date())

case class User(
  id: String,
  email: String,
  createdAt: Date = new Date()
  )
//we can get rid of the duplication 

trait Visitor {
  def id: String //Unique id assigned to each user
  def createdAt: Date //Date this user first visited the site
  def age: Long  = new Date().getTime - createdAt.getTime
}


case class Anonymous(
  id: String, 
  createdAt: Date = new Date()
) extends Visitor

case class User(
  id: String,
  email: String,
  createdAt: Date = new Date()
  ) extends Visitor

def older(v1: Visitor, v2: Visitor): Boolean = 
  v1.createdAt.before(v2.createdAt)

older(Anonymous("1"), User("2", "test@example.com"))

val anon = Anonymous("anon1")
anon.createdAt
anon.age
