// bind to the window load event. this stub sets the test ID to the string "loaded"
window.onload = (e) =>
{
    var evtSource = new EventSource('/');
    console.log(evtSource.readyState);
    evtSource.onmessage = (i) =>
    {
        document.getElementById('top_tabs').textContent = i.data;
        console.log(i.data);
    }
    evtSource.addEventListener('greeting',(event)=>
    {
        let message = `Greetings ${event.data}`;
        document.getElementById('greeting').textContent = message;
        console.log(event.data);
    })

};