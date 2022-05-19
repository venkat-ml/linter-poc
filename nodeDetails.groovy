import jenkins.model.Jenkins



def call() 
    {
        Computer[] computers = Jenkins.get().getComputers()
    List nodes_offline_list = [];
    computers.each {
        if (it.isOnline()==false) 
        {
            nodes_offline_list.add(it.getDisplayName())
        }
    }
    return nodes_offline_list
        
}
