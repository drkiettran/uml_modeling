package uml_example_1;

/**
 * @startuml
 * Alice -> Bob: Hello
 * Bob -> Alice: Hello too
 * @enduml
 */

/**
 * @startuml
 * skinparam actorStyle awesome
 * :User: -> (Use)
 * "Main Admin" as Admin
 * "Use the Application" as (Use)
 * Admin--> (Admin the Application)
 * @enduml
 */

/**
 * @startuml
Alice -> Bob: Authentication Request
alt successful case
Bob -> Alice: Authentication Accepted
else some kind of failure
Bob -> Alice: Authentication Failure
group My own label
Alice -> Log : Log attack start
loop 1000 times
Alice -> Bob: DNS Attack
end
Alice -> Log : Log attack end
end
else Another type of failure
Bob -> Alice: Please repeat
end
@enduml
 */

public class example_1 {
  protected int a;
  public String c;
  
  public void method_a() {
  
  }
}
