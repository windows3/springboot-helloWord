this is myFreemarker file<br>
${name}

<#if age==1>
    男
        <#elseif age==2>
        女
        <#else >
            其他
</#if>

<#list userList as user>
    ${user}
</#list>