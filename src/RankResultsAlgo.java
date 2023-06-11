import java.util.ArrayList;
import java.util.LinkedList;

class RankResultsAlgo {
    String reward = "";
    private int total_score = 0;


public String[] results_scores(int kernel, int process_management, int io_management, int file_managment, int storage_management, int memory_management, int protection, int command_interpreter)
{

    String kernel_reward, pm_reward, io_reward, fm_reward, sm_reward, mem_reward, protection_reward, command_reward;
    int total_score = kernel + process_management + io_management + file_managment + storage_management + memory_management + protection + command_interpreter;
    //kernel processing
    kernel_reward = processKernel(kernel);
    pm_reward = processPM(process_management);  
    io_reward = processIO(io_management);
    fm_reward = processFM(file_managment);
    sm_reward = processSM(storage_management);
    mem_reward = processMEM(memory_management);
    protection_reward = processPR(protection);
    command_reward = processCI(command_interpreter);
    
    String [] data = {kernel_reward, pm_reward, io_reward, fm_reward, sm_reward, mem_reward, protection_reward, command_reward};
    setTotalScore(total_score);
    return data;
    
    // System.out.println("You Got " + "\n" + 
    // "Kernel: " + kernel_reward + "\n" +
    // "Process Management: " + pm_reward + "\n"+
    // "I/O Management: " + io_reward + "\n" +
    // "File Management: " + fm_reward + "\n" +
    // "Storage Management: " + sm_reward + "\n" +
    // "Memory Management: " + mem_reward + "\n" +
    // "Protection: " + protection_reward + "\n" +
    // "Command Interpreter: " + command_reward + "\n" + 
    // "Total Points: " + total_score
    // );
    
    
}

public void setTotalScore(int total_score) {
    this.total_score = total_score;
}

public int getTotalScore(){
    return this.total_score;
}

public String osQuality (int score) {

    String quality = "";

    if(score >= 0 && score < 25){
        
    }
    else if(score >= 25 && score < 50){
        
    }
    else if(score >= 25 && score < 50){
        
    }

    return quality;
    
}


//kernel
private String processKernel(int score) {

    if(score >= 0 && score < 25){
        reward = "Monolithic Kernel";
    }
    else if(score >= 25 && score < 50){
        reward = "Layered kernel";
    }
    else if(score >= 50 && score < 75){
        reward = "Microkernel";
    }
    else if(score >= 75 && score <= 100){
        reward = "Graph kernel";
    }
    return reward;
}

//process management
private String processPM(int score) {

    if(score >= 0 && score < 25){
        reward = "Batch processing";
    }
    else if(score >= 25 && score < 50){
        reward = "Time Sharing";
    }
    else if(score >= 50 && score < 75){
        reward = "Multilevel Feedback Queues";
    }
    else if(score >= 75 && score <= 100){
        reward = "Completely Fair Scheduler";
    }
    return reward;
}

//file management
private String processFM(int score) {

    if(score >= 0 && score < 25){
        reward = "Direct File Access";
    }
    else if(score >= 25 && score < 50){
        reward = "File Directories";
    }
    else if(score >= 50 && score < 75){
        reward = "Flat-file storage";
    }
    else if(score >= 75 && score <= 100){
        reward = "COM Structured Storage";
    }
    return reward;
}

//IO
private String processIO(int score) {
    
    if(score >= 0 && score < 25){
        reward = "IO Sync by Interlock";
    }
    else if(score >= 25 && score < 50){
        reward = "IO Polling";
    }
    else if(score >= 50 && score < 75){
        reward = "Interrupt-Driven IO";
    }
    else if(score >= 75 && score <= 100){
        reward = "IO Controllers";
    }

    return reward;
}

//Storage Management
private String processSM(int score) {

    if(score >= 0 && score < 25){
        reward = "Direct Mapping";
    }
    else if(score >= 25 && score < 50){
        reward = "Memory Virtualization";
    }
    else if(score >= 50 && score < 75){
        reward = "Memory Controllers";
    }
    else if(score >= 75 && score <= 100){
        reward = "Dynamic Memory Management";
    }

    return reward;
}

//Memory Management
private String processMEM(int score) {

    if(score >= 0 && score < 25){
        reward = "Checks and Bounds";
    }
    else if(score >= 25 && score < 50){
        reward = "Segmentation";
    }
    else if(score >= 50 && score < 75){
        reward = "Paging";
    }
    else if(score >= 75 && score <= 100){
        reward = "Segmented Paging";
    }


    return reward;
}

//Protection
private String processPR(int score) {

    if(score >= 0 && score < 25){
        reward = "Access Control Bits";
    }
    else if(score >= 25 && score < 50){
        reward = "Encryption";
    }
    else if(score >= 50 && score < 75){
        reward = "User Authentication";
    }
    else if(score >= 75 && score <= 100){
        reward = "Firewalls";
    }


    return reward;
}

//Command Interpreter
private String processCI(int score) {

    if(score >= 0 && score < 25){
        reward = "Simple Interpreter";
    }
    else if(score >= 25 && score < 50){
        reward = "Self-interpreter";
    }
    else if(score >= 50 && score < 75){
        reward = "Bytecode Interpreter";
    }
    else if(score >= 75 && score <= 100){
        reward = "Template Interpreter";
    }

    
    return reward;
}

}